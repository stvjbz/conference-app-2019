package io.github.droidkaigi.confsched2019.data.firestore

import io.github.droidkaigi.confsched2019.model.Announcement

interface FireStore {
    suspend fun getFavoriteSessionIds(): List<Int>
    suspend fun toggleFavorite(sessionId: String)
    suspend fun getAnnouncements(): List<Announcement>
}
