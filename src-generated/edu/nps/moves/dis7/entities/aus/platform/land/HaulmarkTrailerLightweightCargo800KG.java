package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ed17bee;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29387
 */
public class HaulmarkTrailerLightweightCargo800KG extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerLightweightCargo800KG()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 29384, Cargo Trailer
        setSubCategory((byte)2); // uid 29386, 0.51 - 2 Ton
        setSpecific((byte)1); // uid 29387, Haulmark - Trailer, Lightweight Cargo, 800KG
    }
}
