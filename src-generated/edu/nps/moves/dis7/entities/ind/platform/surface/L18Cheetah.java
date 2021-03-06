package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51acdf2e;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23173
 */
public class L18Cheetah extends EntityType
{
    /** Default constructor */
    public L18Cheetah()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 23170, Tank Landing Ship
        setSubCategory((byte)1); // uid 23171, Polnochny class
        setSpecific((byte)2); // uid 23173, L18 Cheetah
    }
}
