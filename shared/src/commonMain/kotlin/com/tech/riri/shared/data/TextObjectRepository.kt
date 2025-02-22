package com.tech.riri.shared.data

import com.tech.riri.shared.data.local.TextObjectInterface
import com.tech.riri.shared.data.models.TextObjectDataModel


class TextObjectRepository(val database: TextObjectInterface) {


    fun addText(text: String) {
        database.addText(text)
    }


    fun deleteText(textId: Long) {
        database.deleteText(textId)
    }

    fun getTexts(): List<TextObjectDataModel> {
        return database.getTexts().map {
            TextObjectDataModel(it.audioText, it.id)
        }
    }
}