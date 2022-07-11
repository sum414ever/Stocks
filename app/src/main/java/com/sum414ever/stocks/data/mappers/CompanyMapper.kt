package com.sum414ever.stocks.data.mappers

import com.sum414ever.stocks.data.local.CompanyListingEntity
import com.sum414ever.stocks.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing() = CompanyListing(name, symbol, exchange)

fun CompanyListing.toCompanyListingEntity() = CompanyListingEntity(name, symbol, exchange)
