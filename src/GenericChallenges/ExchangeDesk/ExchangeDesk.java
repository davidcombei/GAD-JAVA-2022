package GenericChallenges.ExchangeDesk;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk<F extends Currency,T extends Currency> {
    private int rate=4;
         public T convert(F from, Class<T> toClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

               int value = from.getValue()  * rate;
              T toReturn = toClass.getDeclaredConstructor(Integer.class).newInstance(value);
             return toReturn;
         }

    public static void main(String[] args) {
        ExchangeDesk<USD,RON>exchange =new ExchangeDesk<USD,RON>();
        USD usd=new USD(10);
        try{
            RON ron=exchange.convert(usd,RON.class);
            System.out.println(ron);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
