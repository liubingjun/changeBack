package change.service

import java.lang.Long

import change.model.HttpApi
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository

trait HttpApiRepository extends PagingAndSortingRepository[HttpApi, Long] {
  @Query(value = "SELECT distinct product FROM http_api", nativeQuery = true)
  def findProducts(): java.util.List[String]
}