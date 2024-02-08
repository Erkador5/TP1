package ca.ulaval.ima.tp1
import android.os.Parcel
import android.os.Parcelable
import java.util.Date

data class Profil(
    val nom: String?,
    val prenom: String?,
    val dateNaissance: Date?,
    val idul: String?
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        Date(parcel.readLong()),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nom)
        parcel.writeString(prenom)
        parcel.writeLong(dateNaissance?.time ?: -1)
        parcel.writeString(idul)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Profil> {
        override fun createFromParcel(parcel: Parcel): Profil {
            return Profil(parcel)
        }

        override fun newArray(size: Int): Array<Profil?> {
            return arrayOfNulls(size)
        }
    }
}
