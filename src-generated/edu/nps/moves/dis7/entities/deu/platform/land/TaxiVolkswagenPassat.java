package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4808bc9b;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24855
 */
public class TaxiVolkswagenPassat extends EntityType
{
    /** Default constructor */
    public TaxiVolkswagenPassat()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24851, Utility/Emergency Car
        setSubCategory((byte)5); // uid 24854, Taxi
        setSpecific((byte)1); // uid 24855, Taxi, Volkswagen Passat
    }
}
