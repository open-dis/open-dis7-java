package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ad5c04e;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17578
 */
public class _1102Brolga extends EntityType
{
    /** Default constructor */
    public _1102Brolga()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17565, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 17577, COOP Class (Minesweepers - Auxiliary)
        setSpecific((byte)1); // uid 17578, 1102 Brolga
    }
}
