package expert002;

import org.example.expert001_03.AmericaTire;
import org.example.expert001_03.Car;
import org.example.expert001_03.KoreaTire;
import org.example.expert001_03.Tire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void 자동차_코리어타이어_장착_타이어브랜드_테스트(){
        Tire tire1 = new KoreaTire();
        Car car1 = new Car();
        car1.setTire(tire1);

        assertEquals("장착된 타이어 : 코리아 타이어", car1.getTireBrand());
    }
    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트(){
        Tire tire1 = new AmericaTire();
        Car car1 = new Car();
        car1.setTire(tire1);

        assertEquals("장착된 타이어 : 미국 타이어", car1.getTireBrand());
    }
}
