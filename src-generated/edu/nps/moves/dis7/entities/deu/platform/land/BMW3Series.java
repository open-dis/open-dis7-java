package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@222a59e6;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25275
 */
public class BMW3Series extends EntityType
{
    /** Default constructor */
    public BMW3Series()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24838, Car
        setSubCategory((byte)42); // uid 24839, 4-Door Sedan, Economy/Compact (Small)
        setSpecific((byte)2); // uid 25275, BMW 3 Series
    }
}
