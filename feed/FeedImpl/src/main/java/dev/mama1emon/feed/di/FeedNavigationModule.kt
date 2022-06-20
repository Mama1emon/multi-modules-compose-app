package dev.mama1emon.feed.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dev.mama1emon.di.FeatureEntryKey
import dev.mama1emon.feed.navigation.FeedEntry
import dev.mama1emon.feed.navigation.FeedEntryImpl
import dev.mama1emon.navigation.FeatureEntry
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface FeedNavigationModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(FeedEntry::class)
    fun bindFeedEntry(entry: FeedEntryImpl): FeatureEntry
}
