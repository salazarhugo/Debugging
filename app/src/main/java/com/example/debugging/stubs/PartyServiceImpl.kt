package com.example.debugging.stubs

import cheers.party.v1.FeedPartyRequest
import cheers.party.v1.FeedPartyResponse
import cheers.party.v1.PartyServiceGrpcKt

class PartyService : PartyServiceGrpcKt.PartyServiceCoroutineImplBase() {
    override suspend fun feedParty(request: FeedPartyRequest): FeedPartyResponse {
        return super.feedParty(request)
    }
}