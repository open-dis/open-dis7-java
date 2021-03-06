package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d157787;
 * Country: Oman (OMN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29533
 */
public class Q40AlShamikh extends EntityType
{
    /** Default constructor */
    public Q40AlShamikh()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 17969, Frigate (including Corvettes)
        setSubCategory((byte)2); // uid 29532, Khareff Class
        setSpecific((byte)1); // uid 29533, Q40 Al Shamikh
    }
}
