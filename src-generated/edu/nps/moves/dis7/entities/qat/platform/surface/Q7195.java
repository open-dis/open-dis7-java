package edu.nps.moves.dis7.entities.qat.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a60ee36;
 * Country: Qatar (QAT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17843
 */
public class Q7195 extends EntityType
{
    /** Default constructor */
    public Q7195()
    {
        setCountry(Country.QATAR_QAT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17828, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17842, Fairey Marine Spear Class (coastal patrol craft)
        setSpecific((byte)1); // uid 17843, Q71-95
    }
}
