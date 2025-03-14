package realtime.videocall.app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String emailID;

    @Column
    private boolean isOnline = false;

    @Column
    private boolean isOnCall = false;
}
