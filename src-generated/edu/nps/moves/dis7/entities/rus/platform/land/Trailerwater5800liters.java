package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3028e50e;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22971
 */
public class Trailerwater5800liters extends EntityType
{
    /** Default constructor */
    public Trailerwater5800liters()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 13005, Water trailer
        setSubCategory((byte)2); // uid 13009, 1001- 5000 gallons
        setSpecific((byte)1); // uid 22971, Trailer, water, 5800 liters
    }
}
