package dev.mama1emon.hub.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dev.mama1emon.di.FeatureEntryKey
import dev.mama1emon.hub.navigation.HubEntry
import dev.mama1emon.hub.navigation.HubEntryImpl
import dev.mama1emon.navigation.FeatureEntry
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface HubNavigationModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(HubEntry::class)
    fun bindFeedEntry(entry: HubEntryImpl): FeatureEntry
}
