package ir.kaaveh.domain.use_case

import ir.kaaveh.domain.repository.MarketRepository
import ir.kaaveh.domain.test.favoriteMarket
import ir.kaaveh.domain.test.notFavoriteMarket
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

@OptIn(ExperimentalCoroutinesApi::class)
class GetNewsUseCaseTest {

    private lateinit var mockRepository: MarketRepository
    private lateinit var getNewsUseCase: GetMarketsUseCase

    @Before
    fun provideRepository() {
        mockRepository = mock {
            on { getNews() } doReturn flow {
                emit(listOf(favoriteMarket, notFavoriteMarket))
            }
        }
        getNewsUseCase = GetMarketsUseCase(repository = mockRepository)
    }

    @Test
    fun getNews() = runTest {
        val news = getNewsUseCase().first()
        assertTrue(news.size == 2)
    }

}