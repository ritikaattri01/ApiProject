package com.app.apiproject.ui.models

import android.os.Parcel
import android.os.Parcelable

data class PullRequestModel(
    val image:Int,
    val name: String?,
    val desc: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(desc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PullRequestModel> {
        override fun createFromParcel(parcel: Parcel): PullRequestModel {
            return PullRequestModel(parcel)
        }

        override fun newArray(size: Int): Array<PullRequestModel?> {
            return arrayOfNulls(size)
        }
    }
}