package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6475472c;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 18288
 */
public class M110A2 extends EntityType
{
    /** Default constructor */
    public M110A2()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 18285, Self Propelled Artillery (guns and howitzers)
        setSubCategory((byte)3); // uid 18288, M-110A2
    }
}
