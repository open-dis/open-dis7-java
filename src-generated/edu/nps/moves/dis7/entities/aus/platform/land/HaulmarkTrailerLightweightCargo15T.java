package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a33fae0;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29388
 */
public class HaulmarkTrailerLightweightCargo15T extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerLightweightCargo15T()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 29384, Cargo Trailer
        setSubCategory((byte)2); // uid 29386, 0.51 - 2 Ton
        setSpecific((byte)2); // uid 29388, Haulmark - Trailer, Lightweight Cargo, 1.5T
    }
}
