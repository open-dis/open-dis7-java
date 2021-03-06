package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f3c6ac4;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23290
 */
public class M853Haarlem extends EntityType
{
    /** Default constructor */
    public M853Haarlem()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23288, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23289, Alkmaar Class
        setSpecific((byte)1); // uid 23290, M853 Haarlem
    }
}
