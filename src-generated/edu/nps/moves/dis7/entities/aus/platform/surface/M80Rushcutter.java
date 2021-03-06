package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@721e0f4f;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17575
 */
public class M80Rushcutter extends EntityType
{
    /** Default constructor */
    public M80Rushcutter()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17565, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 17574, Bay Class (Minehunters - Inshore)
        setSpecific((byte)1); // uid 17575, M 80 Rushcutter
    }
}
