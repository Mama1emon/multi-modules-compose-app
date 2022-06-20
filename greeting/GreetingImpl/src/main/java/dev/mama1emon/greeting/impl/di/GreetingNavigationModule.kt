package dev.mama1emon.greeting.impl.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dev.mama1emon.di.FeatureEntryKey
import dev.mama1emon.greeting.api.navigation.GreetingEntry
import dev.mama1emon.greeting.impl.navigation.GreetingEntryImpl
import dev.mama1emon.navigation.FeatureEntry
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface GreetingNavigationModule {

    @Binds
    @Singleton
    fun bind(entry: GreetingEntryImpl): GreetingEntry

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(GreetingEntry::class)
    fun bindGreetingEntry(entry: GreetingEntryImpl): FeatureEntry
}
