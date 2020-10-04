package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@485c84d7
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: LAND
 *
 * Entity type uid: 30590
 */
public class ClubKMissileContainerGroundAttack extends EntityType
{
    public ClubKMissileContainerGroundAttack()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 22062, Cargo Container
        setSubCategory((byte)2); // uid 30588, Club-K Missile Container
        setSpecific((byte)2); // uid 30590, Club-K Missile Container - Ground Attack
    }
}
