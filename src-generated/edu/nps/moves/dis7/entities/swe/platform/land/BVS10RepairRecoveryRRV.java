package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d5c04f9
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 27661
 */
public class BVS10RepairRecoveryRRV extends EntityType
{
    public BVS10RepairRecoveryRRV()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
        setSubCategory((byte)4); // uid 27658, All Terrain Vehicle (Protected) / ATV(P) / Viking / BvS 10
        setSpecific((byte)3); // uid 27661, BV-S10 Repair & Recovery (RRV)
    }
}
