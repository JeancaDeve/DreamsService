package api.dreams.DreamsService.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "guest")
data class MdGuest (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val code  : Long,
    @Column(length = 60)
    val name :String,
    @Column(name = "last_name", length = 60)
    val lastName : String,
    @Column(unique = true, columnDefinition = "char(8)")
    val dni : String,
    @Column(name = "phone_number", columnDefinition = "char(9)" , unique = true)
    val phoneNumber : String,
    @Column(name = "user_name", length = 60)
    val userName : String
)