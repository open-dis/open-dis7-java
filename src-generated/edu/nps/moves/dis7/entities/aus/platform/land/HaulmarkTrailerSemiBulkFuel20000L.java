package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2437c6dc;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29402
 */
public class HaulmarkTrailerSemiBulkFuel20000L extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerSemiBulkFuel20000L()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 29396, Fuel Trailer
        setSubCategory((byte)3); // uid 29401, Greater than 5000 Gallons
        setSpecific((byte)1); // uid 29402, Haulmark - Trailer, Semi, Bulk Fuel, 20000L
    }
}
