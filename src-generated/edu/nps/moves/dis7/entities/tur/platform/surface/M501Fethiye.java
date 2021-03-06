package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@618ff5c2;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23273
 */
public class M501Fethiye extends EntityType
{
    /** Default constructor */
    public M501Fethiye()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23264, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 23271, Cove class
        setSpecific((byte)2); // uid 23273, M501 Fethiye
    }
}
