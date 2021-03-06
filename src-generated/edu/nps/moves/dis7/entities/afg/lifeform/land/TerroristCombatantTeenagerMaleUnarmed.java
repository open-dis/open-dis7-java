package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7740b0ab;
 * Country: Afghanistan (AFG);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32754
 */
public class TerroristCombatantTeenagerMaleUnarmed extends EntityType
{
    /** Default constructor */
    public TerroristCombatantTeenagerMaleUnarmed()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32204, Terrorist Combatant
        setSubCategory((byte)0); // uid 32752, None
        setSpecific((byte)0); // uid 32753, Terrorist Combatant, Unarmed
        setExtra((byte)50); // uid 32754, Terrorist Combatant Teenager, Male (Unarmed)
    }
}
