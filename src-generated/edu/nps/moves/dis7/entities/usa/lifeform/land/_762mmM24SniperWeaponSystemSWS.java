package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@46e388ec;
 * Country: United States of America (USA);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32678
 */
public class _762mmM24SniperWeaponSystemSWS extends EntityType
{
    /** Default constructor */
    public _762mmM24SniperWeaponSystemSWS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)15); // uid 32677, Sniper Rifles
        setSpecific((byte)37); // uid 32678, 7.62mm M24 Sniper Weapon System (SWS)
    }
}
