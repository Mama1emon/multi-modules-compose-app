package dev.mama1emon.profile.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dev.mama1emon.di.FeatureEntryKey
import dev.mama1emon.navigation.FeatureEntry
import dev.mama1emon.profile.navigation.ProfileEntry
import dev.mama1emon.profile.navigation.ProfileEntryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface ProfileNavigationModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(ProfileEntry::class)
    fun bindFeedEntry(entry: ProfileEntryImpl): FeatureEntry
}
