/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.generate;

import java.io.Serializable;
import java.util.stream.Stream;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 *
 * @author AS-L42
 */
public class MyGenerator implements IdentifierGenerator{
   private String prefix = "PROD";
  @Override
  public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
    String query = "SELECT p.id_product FROM Product p";
    Stream<String> ids = session.createQuery(query, String.class).stream();
    Long max = ids.map(o -> o.replace(prefix, "")).mapToLong(Long::parseLong).max().orElse(0L);
    return prefix + (String.format("%04d", max + 1));
  }
}
