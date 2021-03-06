package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f953efd;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22761
 */
public class M109GEA2 extends EntityType
{
    /** Default constructor */
    public M109GEA2()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16273, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 22758, M109 Self-Propelled 155 mm Howitzer
        setSpecific((byte)3); // uid 22761, M109GEA2
    }
}
