package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@cd2dae5;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23111
 */
public class _331Vancouver extends EntityType
{
    /** Default constructor */
    public _331Vancouver()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18782, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 18783, Halifax Class (FFG)
        setSpecific((byte)2); // uid 23111, 331 Vancouver
    }
}
