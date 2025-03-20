#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct Tree{
	int data;
	struct Tree* lChild;
	struct Tree* rChild;
};

struct Tree* Root=NULL;

struct Tree* createNode(int item){
	struct Tree* ptr=(struct Tree*) malloc (sizeof(struct Tree));

	ptr->data=item;
	ptr->lChild=NULL;
	ptr->rChild=NULL;

	return ptr;
}

bool isEmpty(){ return (Root==NULL)? true:false; }

void insertNode(int item){
	if(isEmpty()){
		Root=createNode(item);
		return;
	}

	else{
		struct Tree* ptr=Root;

		while(true){
			if(item < ptr->data){
				if(ptr->lChild==NULL){
					struct Tree* baby=createNode(item);
					ptr->lChild=baby;
					printf("%d node inserted on lChild!\n",ptr->data);

					return;
				}

				else ptr=ptr->lChild;
			}

			else if(item > ptr->data){
				if(ptr->rChild==NULL){
					struct Tree* baby=createNode(item);
					ptr->rChild=baby;
					printf("%d node inserted on rChild!\n",ptr->data);

					return;
				}

				else ptr=ptr->rChild;
			}

			else { printf("value already exists!\n"); return; }
		}
	}
}

void preOrder(struct Tree* ptr){
	if(ptr!=NULL){
		printf("\n%d",ptr->data);
		preOrder(ptr->lChild);
		preOrder(ptr->rChild);
	}
}

void inOrder(struct Tree* ptr){
	if(ptr!=NULL){
		inOrder(ptr->lChild);
		printf("\n%d",ptr->data);
		inOrder(ptr->rChild);
	}
}

void postOrder(struct Tree* ptr){
	if(ptr!=NULL){
		postOrder(ptr->lChild);
		postOrder(ptr->rChild);
		printf("\n%d",ptr->data);
	}
}

bool search(int key,struct Tree* ptr){
	if(ptr==NULL) {
		return false;
	}

	else if(key==ptr->data) return true;

	else if(key < ptr->data){
		return search(key,ptr->lChild);
	}

	else if(key > ptr->data){
		return search(key,ptr->rChild);
	}
}

int count(struct Tree* ptr){
	if(ptr!=NULL){
		int leftNode=count(ptr->lChild);
		int rightNode=count(ptr->rChild);

		return 1 + leftNode + rightNode ;
	}
}

int height(struct Tree* ptr){
	if(ptr==NULL) return 0;

	int left=height(ptr->lChild);
	int right=height(ptr->rChild);

	if(left>right){ return left+1; }

	else{ return right+1; }
}

int main(){
	printf("1.{INSERT}\n");
	printf("2.{PREORDER}\n");
	printf("3.{INORDER}\n");
	printf("4.{POSTORDER}\n");
	printf("5.{COUNT}\n");
	printf("6.{HEIGHT}\n");
	printf("7.{SEARCH}\n");

	while(true){
		printf("\nchoice:");
		int choice;
		scanf("%d",&choice);

		int temp;

		switch(choice){
			case 1:printf("enter a no:");
			       scanf("%d",&temp);
			       insertNode(temp);

			       break;

			case 2:preOrder(Root);
			       break;

			case 3:inOrder(Root);
			       break;

			case 4:postOrder(Root);
			       break;

			case 5:printf("no of nodes:%d\n",count(Root));
			       break;

			case 6:printf("height of tree:%d\n",height(Root));
			       break;

			case 7:printf("enter a key:");
			       scanf("%d",&temp);
			       (search(temp,Root)) ? printf("key found!\n") : printf("key not found!\n");
			       break;

			case 0:printf("bye!");
			       return 0;
			       break;

			default:printf("invalid choice!\n");
		}
	}
}
