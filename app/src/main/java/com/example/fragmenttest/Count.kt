package com.example.fragmenttest

import android.os.Parcel
import android.os.Parcelable

data class Count(var cnt: Int = 0): Parcelable {
    constructor(parcel: Parcel) : this(parcel.readInt()) {
    }

    override fun describeContents(): Int = 0

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        p0?.writeInt(p1)?: 0
    }

    companion object CREATOR : Parcelable.Creator<Count> {
        override fun createFromParcel(parcel: Parcel): Count {
            return Count(parcel)
        }

        override fun newArray(size: Int): Array<Count?> {
            return arrayOfNulls(size)
        }
    }
}