package api.dreams.DreamsService.models

import api.dreams.DreamsService.enums.RoomStatus
import jakarta.persistence.*

@Entity
@Table(name = "room")
data class MdRoom(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val code : Long,
    val number : Short,
    @Column(length = 500)
    val description : String,
    @Column(length = 200)
    val content : String,
    val price : Float,
    val images : String,
    @Enumerated(EnumType.STRING)
    val status : RoomStatus,
    val floor : Short
)
