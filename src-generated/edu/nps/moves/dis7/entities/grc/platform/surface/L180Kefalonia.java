package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e70f13a;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23333
 */
public class L180Kefalonia extends EntityType
{
    /** Default constructor */
    public L180Kefalonia()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 23331, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 23332, Zubr Class
        setSpecific((byte)1); // uid 23333, L180 Kefalonia
    }
}
