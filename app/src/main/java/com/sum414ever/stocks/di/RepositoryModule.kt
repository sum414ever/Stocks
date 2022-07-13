package com.sum414ever.stocks.di

import com.sum414ever.stocks.data.csv.CSVParser
import com.sum414ever.stocks.data.csv.CompanyListingsParser
import com.sum414ever.stocks.data.repository.StockRepositoryImpl
import com.sum414ever.stocks.domain.model.CompanyListings
import com.sum414ever.stocks.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListings>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}