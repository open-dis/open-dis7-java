package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6cf047cf;
 * Country: Afghanistan (AFG);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32208
 */
public class TerroristCombatantTeenagerFemalewExplosiveVest extends EntityType
{
    /** Default constructor */
    public TerroristCombatantTeenagerFemalewExplosiveVest()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32204, Terrorist Combatant
        setSubCategory((byte)1); // uid 32205, Weapon, Non-specific
        setSpecific((byte)100); // uid 32206, Explosive Vest
        setExtra((byte)150); // uid 32208, Terrorist Combatant Teenager, Female w/ Explosive Vest
    }
}
