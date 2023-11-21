package com.example.mychartapp.Data

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.example.mychartapp.R

@Parcelize
data class Person(
    val id: Int = 0,
    val name: String? = "",
    @DrawableRes val icon: Int = R.drawable.ic_launcher_foreground
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeInt(icon)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}

val personList = listOf(
    Person(
        1,
        "Pranav",
        R.drawable.ic_launcher_foreground
    ),
    Person(
        2,
        "Ayesha",
        R.drawable.ic_launcher_background
    ),
    Person(
        3,
        "Roshini",
        R.drawable.ic_launcher_foreground
    ),
    Person(
        4,
        "Kaushik",
        R.drawable.ic_launcher_background
    ),
    Person(
        5,
        "Dad",
        R.drawable.person_5
    ),
    Person(
        6,
        "Pranav",
        R.drawable.ic_launcher_foreground
    ),
    Person(
        7,
        "Ayesha",
        R.drawable.ic_launcher_background
    ),
    Person(
        8,
        "Roshini",
        R.drawable.ic_launcher_foreground
    ),
    Person(
        9,
        "Kaushik",
        R.drawable.ic_launcher_background
    ),
    Person(
        10,
        "Dad",
        R.drawable.person_5
    ),
)