package com.app.apiproject.ui.models

import android.os.Parcel
import android.os.Parcelable

data class CategoriesModel(
    val img: Int,
    val name: String?,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(img)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoriesModel> {
        override fun createFromParcel(parcel: Parcel): CategoriesModel {
            return CategoriesModel(parcel)
        }

        override fun newArray(size: Int): Array<CategoriesModel?> {
            return arrayOfNulls(size)
        }
    }
}
