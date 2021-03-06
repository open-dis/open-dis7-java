package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@619bfe29;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18584
 */
public class A5303AmmiraglioMagnaghi extends EntityType
{
    /** Default constructor */
    public A5303AmmiraglioMagnaghi()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 18583, Auxiliary, Merchant Marine
        setSubCategory((byte)1); // uid 18584, A5303 Ammiraglio Magnaghi
    }
}
