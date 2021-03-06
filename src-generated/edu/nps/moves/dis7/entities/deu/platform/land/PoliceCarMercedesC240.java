package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1169afe1;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24853
 */
public class PoliceCarMercedesC240 extends EntityType
{
    /** Default constructor */
    public PoliceCarMercedesC240()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24851, Utility/Emergency Car
        setSubCategory((byte)2); // uid 24852, Police Car
        setSpecific((byte)1); // uid 24853, Police Car, Mercedes C240
    }
}
