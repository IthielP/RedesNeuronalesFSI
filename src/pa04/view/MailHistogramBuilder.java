package pa04.view;

import kata4.Attribute;
import pa04.model.Histogram;
import pa04.model.Mail;
import java.util.List;

public class MailHistogramBuilder <T> {
    private final List <T> items;
    public MailHistogramBuilder (List <T> items){
        this.items = items;
    }
    public <A> Histogram <A> build (Attribute <T,A> attribute){
        Histogram<A> histo = new Histogram<>();
        for (T item : items) {
            	A value	= attribute.get(item);
                histo.increment(value);}
        return histo;
    }	
}
