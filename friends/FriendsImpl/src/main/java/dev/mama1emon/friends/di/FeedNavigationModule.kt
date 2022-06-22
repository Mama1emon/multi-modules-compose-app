package dev.mama1emon.friends.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dev.mama1emon.di.FeatureEntryKey
import dev.mama1emon.friends.navigation.FriendsEntry
import dev.mama1emon.friends.navigation.FriendsEntryImpl
import dev.mama1emon.navigation.FeatureEntry
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface FriendsNavigationModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(FriendsEntry::class)
    fun bindFeedEntry(entry: FriendsEntryImpl): FeatureEntry
}
