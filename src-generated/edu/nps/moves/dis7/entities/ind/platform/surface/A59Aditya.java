package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6995bf68;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18853
 */
public class A59Aditya extends EntityType
{
    /** Default constructor */
    public A59Aditya()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18847, Auxiliary
        setSubCategory((byte)3); // uid 18852, Aditya Class (Replenishment and Repair Ship) (AOR/AR)
        setSpecific((byte)1); // uid 18853, A59 Aditya
    }
}
