package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@239a307b;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 16186
 */
public class SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA extends EntityType
{
    /** Default constructor */
    public SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 16186, SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires Dattaque (SNA))
    }
}
