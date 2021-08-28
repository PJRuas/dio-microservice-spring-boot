package one.digitalinnovation.experts.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("iten")
@Data
public class Iten {

    @Id
    private Integer productId;
    private Integer amount;
}
