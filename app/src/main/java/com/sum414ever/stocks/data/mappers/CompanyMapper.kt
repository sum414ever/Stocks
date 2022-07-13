package com.sum414ever.stocks.data.mappers

import com.sum414ever.stocks.data.local.CompanyListingEntity
import com.sum414ever.stocks.domain.model.CompanyListings

fun CompanyListingEntity.toCompanyListing() = CompanyListings(name, symbol, exchange)

fun CompanyListings.toCompanyListingEntity() = CompanyListingEntity(name, symbol, exchange)
