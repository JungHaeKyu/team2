package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.StockApplication;

@Entity
@Table(name = "Stock_table")
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String relatedProductId;

    private Long stock;

    private Integer unitPrice;

    @PostPersist
    public void onPostPersist() {}

    public static StockRepository repository() {
        StockRepository stockRepository = StockApplication.applicationContext.getBean(
            StockRepository.class
        );
        return stockRepository;
    }

    public static void partRequest(Repaired repaired) {
        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(repaired.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

    }
}
