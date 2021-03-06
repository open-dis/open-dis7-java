package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@785a4557;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32721
 */
public class TerroristCombatantwExplosiveVest extends EntityType
{
    /** Default constructor */
    public TerroristCombatantwExplosiveVest()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32719, Terrorist Combatant
        setSubCategory((byte)1); // uid 32720, Weapon, Non-specific
        setSpecific((byte)100); // uid 32721, Terrorist Combatant w/ Explosive Vest
    }
}
